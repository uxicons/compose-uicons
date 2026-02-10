package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GovernmentFlag: ImageVector? = null

val Icons.Bs.GovernmentFlag: ImageVector
    get() = _GovernmentFlag ?: UXIcon(name = "GovernmentFlag") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 15f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.18f, -0.65f, -2.27f, -1.68f, -2.83f)
                lineToRelative(-7.77f, -4.24f)
                curveToRelative(-0.01f, -0.01f, -0.03f, -0.02f, -0.05f, -0.02f)
                verticalLineToRelative(-1.4f)
                lineToRelative(3f, -2f)
                lineTo(10.5f, 0f)
                verticalLineToRelative(5.9f)
                curveToRelative(-0.01f, 0.01f, -0.03f, 0.02f, -0.04f, 0.02f)
                lineToRelative(-7.77f, 4.24f)
                curveToRelative(-1.04f, 0.57f, -1.68f, 1.65f, -1.68f, 2.83f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                lineTo(1f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11.89f, 8.56f)
                curveToRelative(0.07f, -0.04f, 0.15f, -0.04f, 0.22f, 0f)
                lineToRelative(6.3f, 3.44f)
                lineTo(5.59f, 12f)
                lineToRelative(6.3f, -3.44f)
                close()
                moveTo(13f, 15f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                close()
                moveTo(18f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _GovernmentFlag = it}
