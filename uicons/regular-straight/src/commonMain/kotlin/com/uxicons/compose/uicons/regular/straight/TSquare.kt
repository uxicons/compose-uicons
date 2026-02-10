package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TSquare: ImageVector? = null

val Icons.Rs.TSquare: ImageVector
    get() = _TSquare ?: UXIcon(name = "TSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.29f, 4.81f)
                curveToRelative(-1.28f, -0.39f, -3.69f, -1.34f, -5.35f, -3.37f)
                curveToRelative(-0.75f, -0.92f, -1.87f, -1.44f, -3.07f, -1.44f)
                horizontalLineToRelative(-5.75f)
                curveToRelative(-1.2f, 0f, -2.31f, 0.53f, -3.07f, 1.44f)
                curveToRelative(-1.67f, 2.03f, -4.07f, 2.98f, -5.35f, 3.37f)
                lineToRelative(-0.71f, 0.21f)
                verticalLineToRelative(3.97f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3.97f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-0.51f)
                curveToRelative(1.39f, -0.5f, 3.37f, -1.45f, 5f, -3.11f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(6f)
                close()
                moveTo(22f, 7f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3.62f)
                curveToRelative(1.63f, 1.67f, 3.61f, 2.61f, 5f, 3.11f)
                close()
            }
        }.also { _TSquare = it}
