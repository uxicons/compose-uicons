package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonXmark: ImageVector? = null

val Icons.Rs.OctagonXmark: ImageVector
    get() = _OctagonXmark ?: UXIcon(name = "OctagonXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 6.15f)
                lineTo(17.85f, 0.88f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                horizontalLineToRelative(-7.46f)
                curveToRelative(-0.8f, 0f, -1.55f, 0.31f, -2.12f, 0.88f)
                lineTo(0.88f, 6.15f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                verticalLineToRelative(7.46f)
                curveToRelative(0f, 0.8f, 0.31f, 1.55f, 0.88f, 2.12f)
                lineToRelative(5.27f, 5.27f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(7.46f)
                curveToRelative(0.8f, 0f, 1.55f, -0.31f, 2.12f, -0.88f)
                lineToRelative(5.27f, -5.27f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                verticalLineToRelative(-7.46f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(22f, 15.73f)
                curveToRelative(0f, 0.26f, -0.11f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-5.27f, 5.27f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.29f, -0.71f, 0.29f)
                horizontalLineToRelative(-7.46f)
                curveToRelative(-0.26f, 0f, -0.52f, -0.11f, -0.71f, -0.29f)
                lineToRelative(-5.27f, -5.27f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                verticalLineToRelative(-7.46f)
                curveToRelative(0f, -0.26f, 0.11f, -0.52f, 0.29f, -0.71f)
                lineTo(7.57f, 2.29f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.29f, 0.71f, -0.29f)
                horizontalLineToRelative(7.46f)
                curveToRelative(0.27f, 0f, 0.52f, 0.1f, 0.71f, 0.29f)
                lineToRelative(5.27f, 5.27f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                verticalLineToRelative(7.46f)
                close()
                moveTo(16.44f, 8.97f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(-3.04f, -3.04f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _OctagonXmark = it}
