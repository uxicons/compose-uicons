package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BootHeeled: ImageVector? = null

val Icons.Rs.BootHeeled: ImageVector
    get() = _BootHeeled ?: UXIcon(name = "BootHeeled") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.68f, 15.22f)
                lineToRelative(-6.13f, -3.06f)
                curveToRelative(-0.34f, -0.17f, -0.55f, -0.51f, -0.55f, -0.9f)
                lineTo(14.0f, 3f)
                curveToRelative(0f, -0.94f, -0.39f, -1.77f, -1.08f, -2.33f)
                curveToRelative(-0.72f, -0.58f, -1.69f, -0.8f, -2.56f, -0.61f)
                lineTo(0f, 2.08f)
                verticalLineToRelative(21.93f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3.32f)
                lineToRelative(2.78f, 2.22f)
                curveToRelative(0.88f, 0.71f, 1.99f, 1.1f, 3.12f, 1.1f)
                horizontalLineToRelative(9.1f)
                verticalLineToRelative(-3.41f)
                curveToRelative(0f, -2.29f, -1.27f, -4.34f, -3.32f, -5.37f)
                close()
                moveTo(2f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(2f, 22f)
                close()
                moveTo(22f, 22f)
                horizontalLineToRelative(-7.1f)
                curveToRelative(-0.68f, 0f, -1.34f, -0.23f, -1.87f, -0.66f)
                lineToRelative(-2.81f, -2.25f)
                curveToRelative(-0.88f, -0.71f, -1.99f, -1.1f, -3.12f, -1.1f)
                lineTo(2f, 18f)
                lineTo(2f, 3.72f)
                lineToRelative(4f, -0.78f)
                verticalLineToRelative(9.05f)
                horizontalLineToRelative(2f)
                lineTo(8f, 2.56f)
                lineToRelative(2.76f, -0.54f)
                curveToRelative(0.3f, -0.07f, 0.66f, 0.02f, 0.9f, 0.21f)
                curveToRelative(0.22f, 0.18f, 0.34f, 0.44f, 0.34f, 0.77f)
                verticalLineToRelative(8.26f)
                curveToRelative(0f, 1.14f, 0.64f, 2.17f, 1.66f, 2.68f)
                lineToRelative(6.13f, 3.06f)
                curveToRelative(1.36f, 0.68f, 2.21f, 2.05f, 2.21f, 3.58f)
                verticalLineToRelative(1.41f)
                close()
            }
        }.also { _BootHeeled = it}
