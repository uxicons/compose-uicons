package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleWarning: ImageVector? = null

val Icons.Ts.TriangleWarning: ImageVector
    get() = _TriangleWarning ?: UXIcon(name = "TriangleWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.7f, 18.73f)
                lineTo(13.87f, 2.08f)
                curveToRelative(-0.39f, -0.67f, -1.09f, -1.08f, -1.87f, -1.08f)
                reflectiveCurveToRelative(-1.47f, 0.4f, -1.86f, 1.08f)
                lineTo(0.3f, 18.73f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.4f, 0.69f, -0.4f, 1.5f, 0f, 2.18f)
                curveToRelative(0.39f, 0.68f, 1.09f, 1.08f, 1.87f, 1.08f)
                lineTo(21.84f, 21.99f)
                curveToRelative(0.78f, 0f, 1.48f, -0.41f, 1.87f, -1.08f)
                curveToRelative(0.39f, -0.68f, 0.39f, -1.5f, 0f, -2.18f)
                close()
                moveTo(22.84f, 20.42f)
                curveToRelative(-0.21f, 0.36f, -0.58f, 0.58f, -1f, 0.58f)
                lineTo(2.16f, 21f)
                curveToRelative(-0.42f, 0f, -0.79f, -0.22f, -1f, -0.58f)
                curveToRelative(-0.21f, -0.37f, -0.21f, -0.81f, 0f, -1.18f)
                lineTo(11f, 2.58f)
                curveToRelative(0.42f, -0.73f, 1.58f, -0.73f, 2f, 0f)
                lineToRelative(9.84f, 16.65f)
                curveToRelative(0.21f, 0.37f, 0.21f, 0.81f, 0f, 1.18f)
                close()
                moveTo(12.5f, 14f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(6f)
                close()
                moveTo(13f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _TriangleWarning = it}
