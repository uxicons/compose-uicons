package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Films: ImageVector? = null

val Icons.Sr.Films: ImageVector
    get() = _Films ?: UXIcon(name = "Films") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 22f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 23f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-7.76f)
                curveToRelative(0f, -1.14f, 0.49f, -2.22f, 1.33f, -2.98f)
                curveToRelative(0.29f, -0.26f, 0.71f, -0.33f, 1.07f, -0.17f)
                curveToRelative(0.36f, 0.16f, 0.59f, 0.52f, 0.59f, 0.91f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(7.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-10f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(5f, 5.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(22f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 3.05f)
                verticalLineToRelative(1.95f)
                horizontalLineToRelative(1.95f)
                curveToRelative(-0.2f, -0.98f, -0.97f, -1.75f, -1.95f, -1.95f)
                close()
                moveTo(7f, 7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(7f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(7.05f, 5f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(-1.95f)
                curveToRelative(-0.98f, 0.2f, -1.75f, 0.97f, -1.95f, 1.95f)
                close()
                moveTo(9f, 16.95f)
                verticalLineToRelative(-1.95f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(0.2f, 0.98f, 0.97f, 1.75f, 1.95f, 1.95f)
                close()
                moveTo(21.95f, 15f)
                horizontalLineToRelative(-1.95f)
                verticalLineToRelative(1.95f)
                curveToRelative(0.98f, -0.2f, 1.75f, -0.97f, 1.95f, -1.95f)
                close()
            }
        }.also { _Films = it}
