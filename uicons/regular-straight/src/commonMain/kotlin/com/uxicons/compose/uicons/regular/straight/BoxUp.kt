package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxUp: ImageVector? = null

val Icons.Rs.BoxUp: ImageVector
    get() = _BoxUp ?: UXIcon(name = "BoxUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 22f)
                lineTo(2f, 22f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 22f)
                close()
                moveTo(8f, 18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                lineTo(8f, 20f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18.29f, 7.54f)
                lineToRelative(3.16f, 3.16f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.04f, -2.04f)
                verticalLineToRelative(5.93f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.93f)
                lineToRelative(-2f, 2f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(5.93f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5.93f)
                lineToRelative(-2.09f, 2.09f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.21f, -3.21f)
                curveToRelative(0.71f, -0.71f, 1.87f, -0.71f, 2.58f, 0f)
                lineToRelative(1.71f, 1.71f)
                lineToRelative(1.71f, -1.71f)
                curveToRelative(0.71f, -0.71f, 1.87f, -0.71f, 2.58f, 0f)
                close()
            }
        }.also { _BoxUp = it}
