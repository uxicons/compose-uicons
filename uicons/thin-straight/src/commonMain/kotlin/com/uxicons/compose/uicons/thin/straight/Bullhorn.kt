package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullhorn: ImageVector? = null

val Icons.Ts.Bullhorn: ImageVector
    get() = _Bullhorn ?: UXIcon(name = "Bullhorn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 6.6f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 3.81f, -5.42f, 4f, -6.5f, 4f)
                lineTo(2.5f, 4f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.33f, 1.05f, 2.43f, 2.37f, 2.5f)
                lineToRelative(3.28f, 9.0f)
                horizontalLineToRelative(2.1f)
                curveToRelative(0.77f, 0f, 1.47f, -0.38f, 1.89f, -1.02f)
                curveToRelative(0.42f, -0.64f, 0.48f, -1.44f, 0.18f, -2.11f)
                lineToRelative(-2.2f, -5.86f)
                horizontalLineToRelative(5.88f)
                curveToRelative(1.08f, 0f, 6.5f, 0.19f, 6.5f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-6.4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(8.89f, 21.24f)
                curveToRelative(0.17f, 0.39f, 0.14f, 0.83f, -0.09f, 1.19f)
                curveToRelative(-0.23f, 0.36f, -0.62f, 0.57f, -1.05f, 0.57f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(-2.92f, -8f)
                horizontalLineToRelative(3.12f)
                lineToRelative(2.34f, 6.24f)
                close()
                moveTo(8f, 14.0f)
                lineTo(2.5f, 14.0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(9f)
                close()
                moveTo(20f, 16.25f)
                curveToRelative(-1.42f, -1.62f, -4.1f, -2.25f, -6.5f, -2.25f)
                horizontalLineToRelative(-4.5f)
                lineTo(9f, 5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.4f, 0f, 5.08f, -0.63f, 6.5f, -2.25f)
                verticalLineToRelative(13.51f)
                close()
                moveTo(21f, 11.6f)
                verticalLineToRelative(-4f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _Bullhorn = it}
