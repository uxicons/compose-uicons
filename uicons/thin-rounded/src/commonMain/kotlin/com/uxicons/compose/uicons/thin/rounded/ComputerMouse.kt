package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerMouse: ImageVector? = null

val Icons.Tr.ComputerMouse: ImageVector
    get() = _ComputerMouse ?: UXIcon(name = "ComputerMouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 3f)
                horizontalLineToRelative(-1f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                verticalLineToRelative(6.19f)
                curveToRelative(0f, 4.46f, 3.48f, 8.18f, 7.75f, 8.31f)
                curveToRelative(0.08f, 0.0f, 0.17f, 0.0f, 0.25f, 0.0f)
                curveToRelative(2.09f, 0f, 4.06f, -0.8f, 5.57f, -2.26f)
                curveToRelative(1.57f, -1.52f, 2.43f, -3.56f, 2.43f, -5.74f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(13.5f, 4f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1f)
                close()
                moveTo(10.5f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                close()
                moveTo(16.87f, 21.02f)
                curveToRelative(-1.37f, 1.33f, -3.19f, 2.05f, -5.09f, 1.97f)
                curveToRelative(-3.74f, -0.11f, -6.79f, -3.39f, -6.79f, -7.31f)
                verticalLineToRelative(-3.69f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.91f, -0.76f, 3.69f, -2.13f, 5.02f)
                close()
            }
        }.also { _ComputerMouse = it}
