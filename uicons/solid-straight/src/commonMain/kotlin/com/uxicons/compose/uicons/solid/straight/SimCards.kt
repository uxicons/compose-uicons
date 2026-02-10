package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SimCards: ImageVector? = null

val Icons.Ss.SimCards: ImageVector
    get() = _SimCards ?: UXIcon(name = "SimCards") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.07f, 3.71f)
                lineToRelative(-2.83f, -2.83f)
                curveToRelative(-0.57f, -0.57f, -1.32f, -0.88f, -2.12f, -0.88f)
                horizontalLineToRelative(-7.17f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(16f)
                lineTo(21.95f, 5.83f)
                curveToRelative(0f, -0.8f, -0.31f, -1.55f, -0.88f, -2.12f)
                close()
                moveTo(9f, 10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(12f, 17f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveTo(19f, 15.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(19f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(3.95f, 22f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(1.95f, 24f)
                verticalLineToRelative(-14.17f)
                curveToRelative(0f, -0.8f, 0.31f, -1.55f, 0.88f, -2.12f)
                lineToRelative(1.12f, -1.12f)
                verticalLineToRelative(15.41f)
                close()
            }
        }.also { _SimCards = it}
