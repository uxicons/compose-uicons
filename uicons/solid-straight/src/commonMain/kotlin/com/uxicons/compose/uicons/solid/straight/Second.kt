package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Second: ImageVector? = null

val Icons.Ss.Second: ImageVector
    get() = _Second ?: UXIcon(name = "Second") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(0f, 9f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineTo(0f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(14.26f, 20f)
                horizontalLineToRelative(9.74f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.49f, 2.35f, -4.35f, 4.84f, -6.32f)
                curveToRelative(2.54f, -2.01f, 5.16f, -4.08f, 5.16f, -6.68f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-1.86f, 0f, -3.43f, 1.28f, -3.87f, 3f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(0.48f, -2.83f, 2.95f, -5f, 5.92f, -5f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 3.57f, -3.14f, 6.05f, -5.92f, 8.25f)
                curveToRelative(-1.64f, 1.3f, -3.21f, 2.54f, -3.82f, 3.75f)
                close()
            }
        }.also { _Second = it}
