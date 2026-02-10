package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlaskPoison: ImageVector? = null

val Icons.Bs.FlaskPoison: ImageVector
    get() = _FlaskPoison ?: UXIcon(name = "FlaskPoison") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 6.05f)
                verticalLineToRelative(-3.06f)
                horizontalLineToRelative(2f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.06f)
                curveTo(2.77f, 7.91f, 0f, 11.99f, 0f, 16.5f)
                curveToRelative(0f, 2.52f, 0.84f, 4.91f, 2.44f, 6.93f)
                lineToRelative(0.45f, 0.57f)
                horizontalLineToRelative(18.23f)
                lineToRelative(0.45f, -0.57f)
                curveToRelative(1.59f, -2.02f, 2.44f, -4.41f, 2.44f, -6.93f)
                curveToRelative(0f, -4.51f, -2.77f, -8.59f, -7f, -10.45f)
                close()
                moveTo(19.62f, 21f)
                lineTo(4.38f, 21f)
                curveToRelative(-0.9f, -1.35f, -1.38f, -2.9f, -1.38f, -4.5f)
                curveToRelative(0f, -3.58f, 2.4f, -6.79f, 5.98f, -8.0f)
                lineToRelative(1.02f, -0.34f)
                lineTo(10f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5.16f)
                lineToRelative(1.02f, 0.34f)
                curveToRelative(3.58f, 1.21f, 5.98f, 4.42f, 5.98f, 8.0f)
                curveToRelative(0f, 1.6f, -0.47f, 3.15f, -1.38f, 4.5f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(11f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _FlaskPoison = it}
