package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trading: ImageVector? = null

val Icons.Rs.Trading: ImageVector
    get() = _Trading ?: UXIcon(name = "Trading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 16f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(11f, 16f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                close()
                moveTo(13f, 16f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(21.68f, 5.27f)
                lineTo(18.64f, 4.76f)
                curveToRelative(-0.37f, -0.06f, -0.65f, -0.38f, -0.65f, -0.76f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.36f, 0.97f, 2.51f, 2.31f, 2.73f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(0.37f, 0.06f, 0.65f, 0.38f, 0.65f, 0.76f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.36f, -0.97f, -2.51f, -2.31f, -2.73f)
                close()
                moveTo(22f, 18f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(11f)
                curveToRelative(0f, -0.71f, 0.15f, -1.39f, 0.42f, -2f)
                horizontalLineToRelative(-11.42f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _Trading = it}
