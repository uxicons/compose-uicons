package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleWarning: ImageVector? = null

val Icons.Ss.TriangleWarning: ImageVector
    get() = _TriangleWarning ?: UXIcon(name = "TriangleWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.64f, 18.1f)
                lineTo(14.24f, 2.28f)
                curveToRelative(-0.47f, -0.8f, -1.3f, -1.28f, -2.24f, -1.28f)
                reflectiveCurveToRelative(-1.77f, 0.48f, -2.23f, 1.28f)
                lineTo(0.36f, 18.1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.47f, 0.82f, -0.47f, 1.79f, 0f, 2.6f)
                reflectiveCurveToRelative(1.31f, 1.3f, 2.24f, 1.3f)
                lineTo(21.41f, 22f)
                curveToRelative(0.94f, 0f, 1.78f, -0.49f, 2.24f, -1.3f)
                reflectiveCurveToRelative(0.46f, -1.78f, -0.01f, -2.6f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 14f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _TriangleWarning = it}
