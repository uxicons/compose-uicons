package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleWarning: ImageVector? = null

val Icons.Rs.TriangleWarning: ImageVector
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
                moveTo(21.92f, 19.7f)
                curveToRelative(-0.05f, 0.09f, -0.2f, 0.29f, -0.51f, 0.29f)
                lineTo(2.59f, 19.99f)
                curveToRelative(-0.31f, 0f, -0.46f, -0.21f, -0.51f, -0.29f)
                reflectiveCurveToRelative(-0.15f, -0.32f, 0f, -0.59f)
                lineTo(11.49f, 3.29f)
                curveToRelative(0.15f, -0.26f, 0.41f, -0.29f, 0.51f, -0.29f)
                reflectiveCurveToRelative(0.35f, 0.03f, 0.51f, 0.3f)
                lineToRelative(9.4f, 15.82f)
                curveToRelative(0.16f, 0.26f, 0.05f, 0.5f, 0f, 0.59f)
                close()
                moveTo(11f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(11f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _TriangleWarning = it}
