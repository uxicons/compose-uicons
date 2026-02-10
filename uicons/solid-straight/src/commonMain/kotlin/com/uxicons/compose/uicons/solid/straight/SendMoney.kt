package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SendMoney: ImageVector? = null

val Icons.Ss.SendMoney: ImageVector
    get() = _SendMoney ?: UXIcon(name = "SendMoney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.59f)
                lineToRelative(-4.29f, 4.29f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.29f, -4.29f)
                horizontalLineToRelative(-3.59f)
                lineTo(17f, 0f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(21.24f, 9f)
                curveToRelative(0.48f, 1.24f, 0.76f, 2.59f, 0.76f, 4f)
                curveToRelative(0f, 6.08f, -4.92f, 11f, -11f, 11f)
                reflectiveCurveTo(0f, 19.07f, 0f, 13f)
                reflectiveCurveTo(4.92f, 2f, 11f, 2f)
                curveToRelative(1.41f, 0f, 2.76f, 0.28f, 4f, 0.76f)
                verticalLineToRelative(2.0f)
                lineToRelative(-1.53f, 1.53f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(1.53f, -1.53f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9f, 11f)
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
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-0.37f, -0.06f, -0.65f, -0.38f, -0.65f, -0.76f)
                close()
            }
        }.also { _SendMoney = it}
