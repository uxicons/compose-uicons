package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Contract: ImageVector? = null

val Icons.Bs.Contract: ImageVector
    get() = _Contract ?: UXIcon(name = "Contract") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 3f)
                lineToRelative(-12.0f, 0.0f)
                curveToRelative(0f, -1.66f, 1.35f, -3.0f, 3f, -3.0f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.66f)
                verticalLineToRelative(5.36f)
                curveToRelative(-1.07f, -0.05f, -2.15f, 0.32f, -3f, 1.09f)
                verticalLineToRelative(-4.12f)
                horizontalLineToRelative(-5.0f)
                close()
                moveTo(23.36f, 13.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.08f, 0f)
                lineToRelative(-7.27f, 7.27f)
                verticalLineToRelative(3.08f)
                horizontalLineToRelative(3.08f)
                lineToRelative(7.27f, -7.27f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.08f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4.31f, 16.83f)
                curveToRelative(-1.29f, -0.68f, -4.3f, -2.57f, -4.3f, -5.57f)
                verticalLineToRelative(-3.02f)
                curveToRelative(0f, -0.95f, 0.61f, -1.79f, 1.51f, -2.09f)
                lineToRelative(3.49f, -1.15f)
                lineToRelative(3.49f, 1.15f)
                curveToRelative(0.91f, 0.3f, 1.51f, 1.14f, 1.51f, 2.09f)
                verticalLineToRelative(3.02f)
                curveToRelative(0f, 3.0f, -3.01f, 4.89f, -4.3f, 5.57f)
                lineToRelative(-0.69f, 0.36f)
                close()
                moveTo(5.0f, 13.77f)
                curveToRelative(1.03f, -0.67f, 2f, -1.6f, 2f, -2.51f)
                verticalLineToRelative(-2.44f)
                lineToRelative(-2f, -0.66f)
                lineToRelative(-2f, 0.66f)
                verticalLineToRelative(2.44f)
                curveToRelative(0f, 0.91f, 0.97f, 1.84f, 2f, 2.51f)
                close()
                moveTo(17.0f, 10.0f)
                horizontalLineToRelative(-5.0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(7.66f, 18.0f)
                horizontalLineToRelative(5.43f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(-5.26f)
                curveToRelative(-0.9f, 1.35f, -2.15f, 2.35f, -3.17f, 3f)
                close()
            }
        }.also { _Contract = it}
