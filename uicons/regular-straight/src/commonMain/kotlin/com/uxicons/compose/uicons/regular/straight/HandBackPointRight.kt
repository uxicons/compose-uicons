package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRight: ImageVector? = null

val Icons.Rs.HandBackPointRight: ImageVector
    get() = _HandBackPointRight ?: UXIcon(name = "HandBackPointRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.29f, 7.06f)
                curveToRelative(-0.57f, -0.67f, -1.4f, -1.06f, -2.29f, -1.06f)
                horizontalLineToRelative(-7.58f)
                lineTo(9.36f, 1.88f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineTo(0f, 7f)
                verticalLineToRelative(15f)
                lineTo(13.82f, 22f)
                lineToRelative(2f, -10f)
                horizontalLineToRelative(5.07f)
                curveToRelative(1.52f, 0f, 2.83f, -1.08f, 3.07f, -2.5f)
                curveToRelative(0.14f, -0.88f, -0.1f, -1.77f, -0.67f, -2.44f)
                close()
                moveTo(21.99f, 9.18f)
                curveToRelative(-0.08f, 0.46f, -0.56f, 0.82f, -1.09f, 0.82f)
                horizontalLineToRelative(-6.71f)
                lineToRelative(-2f, 10f)
                lineTo(2f, 20f)
                lineTo(2f, 7.83f)
                lineTo(6.54f, 3.29f)
                curveToRelative(0.38f, -0.38f, 1.04f, -0.37f, 1.41f, -0.01f)
                lineToRelative(2.67f, 2.71f)
                horizontalLineToRelative(-3.61f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(14f)
                curveToRelative(0.29f, 0f, 0.57f, 0.13f, 0.76f, 0.35f)
                curveToRelative(0.19f, 0.23f, 0.27f, 0.52f, 0.22f, 0.82f)
                close()
            }
        }.also { _HandBackPointRight = it}
