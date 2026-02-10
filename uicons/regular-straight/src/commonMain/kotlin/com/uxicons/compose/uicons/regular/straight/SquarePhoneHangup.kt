package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquarePhoneHangup: ImageVector? = null

val Icons.Rs.SquarePhoneHangup: ImageVector
    get() = _SquarePhoneHangup ?: UXIcon(name = "SquarePhoneHangup") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.17f, 11.02f)
                curveToRelative(0.5f, 0.5f, 0.83f, 1.19f, 0.83f, 1.96f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.59f)
                curveToRelative(-1.07f, -0.46f, -2.05f, -0.68f, -3f, -0.69f)
                curveToRelative(-1.0f, -0.01f, -1.98f, 0.23f, -3f, 0.69f)
                verticalLineToRelative(2.59f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -0.77f, 0.32f, -1.46f, 0.83f, -1.96f)
                curveToRelative(1.31f, -1.31f, 3.73f, -2.01f, 6.17f, -2.02f)
                curveToRelative(2.39f, -0.01f, 4.79f, 0.64f, 6.17f, 2.02f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(21f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(20f)
                lineTo(22f, 3f)
                close()
            }
        }.also { _SquarePhoneHangup = it}
