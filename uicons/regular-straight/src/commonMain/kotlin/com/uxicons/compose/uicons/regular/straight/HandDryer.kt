package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandDryer: ImageVector? = null

val Icons.Rs.HandDryer: ImageVector
    get() = _HandDryer ?: UXIcon(name = "HandDryer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 12f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(17f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
                moveTo(9f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(18f)
                close()
                moveTo(21f, 14f)
                horizontalLineToRelative(-9.86f)
                curveToRelative(-1.14f, 0f, -2.13f, 0.62f, -2.68f, 1.53f)
                lineToRelative(-3.22f, -3.54f)
                curveToRelative(-1.06f, -1.22f, -3.08f, -1.32f, -4.25f, -0.2f)
                curveToRelative(-1.21f, 1.11f, -1.31f, 3.0f, -0.22f, 4.23f)
                lineToRelative(7.12f, 7.99f)
                horizontalLineToRelative(2.68f)
                lineToRelative(-8.3f, -9.32f)
                curveToRelative(-0.37f, -0.41f, -0.33f, -1.05f, 0.07f, -1.42f)
                curveToRelative(0.39f, -0.37f, 1.07f, -0.34f, 1.43f, 0.07f)
                lineToRelative(4.43f, 4.87f)
                curveToRelative(0.39f, 1.07f, 1.33f, 1.88f, 2.51f, 2.05f)
                lineToRelative(5.16f, 0.74f)
                lineToRelative(0.28f, -1.98f)
                lineToRelative(-5.16f, -0.74f)
                curveToRelative(-0.56f, -0.08f, -0.98f, -0.57f, -0.98f, -1.13f)
                curveToRelative(0f, -0.63f, 0.51f, -1.14f, 1.14f, -1.14f)
                horizontalLineToRelative(9.86f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _HandDryer = it}
