package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InputPipe: ImageVector? = null

val Icons.Rs.InputPipe: ImageVector
    get() = _InputPipe ?: UXIcon(name = "InputPipe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                lineTo(5f, 7f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(15f)
                lineTo(0f, 21f)
                lineTo(0f, 6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(22f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(20f)
                lineTo(22f, 6f)
                close()
            }
        }.also { _InputPipe = it}
