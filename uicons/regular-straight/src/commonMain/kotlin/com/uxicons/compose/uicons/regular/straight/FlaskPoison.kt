package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlaskPoison: ImageVector? = null

val Icons.Rs.FlaskPoison: ImageVector
    get() = _FlaskPoison ?: UXIcon(name = "FlaskPoison") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
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
                moveTo(17f, 6.33f)
                lineTo(17f, 2f)
                horizontalLineToRelative(2f)
                lineTo(19f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.29f)
                curveTo(2.73f, 8.16f, 0f, 12.18f, 0f, 16.71f)
                curveToRelative(0f, 2.51f, 0.84f, 4.89f, 2.43f, 6.91f)
                lineToRelative(0.3f, 0.38f)
                horizontalLineToRelative(18.54f)
                lineToRelative(0.3f, -0.38f)
                curveToRelative(1.59f, -2.01f, 2.43f, -4.4f, 2.43f, -6.91f)
                curveToRelative(0f, -4.4f, -2.79f, -8.49f, -7f, -10.38f)
                close()
                moveTo(20.29f, 22f)
                lineTo(3.71f, 22f)
                curveToRelative(-1.12f, -1.57f, -1.71f, -3.39f, -1.71f, -5.29f)
                curveToRelative(0f, -3.92f, 2.49f, -7.38f, 6.35f, -8.81f)
                lineToRelative(0.65f, -0.24f)
                lineTo(9f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(5.69f)
                lineToRelative(0.64f, 0.25f)
                curveToRelative(3.8f, 1.45f, 6.36f, 4.98f, 6.36f, 8.78f)
                curveToRelative(0f, 1.9f, -0.59f, 3.71f, -1.71f, 5.29f)
                close()
            }
        }.also { _FlaskPoison = it}
