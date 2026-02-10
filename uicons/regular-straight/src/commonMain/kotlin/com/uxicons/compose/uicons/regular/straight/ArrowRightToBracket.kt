package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRightToBracket: ImageVector? = null

val Icons.Rs.ArrowRightToBracket: ImageVector
    get() = _ArrowRightToBracket ?: UXIcon(name = "ArrowRightToBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.41f, 13.41f)
                lineToRelative(-5.5f, 5.5f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.5f, -4.5f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineTo(15f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(5.5f, 5.5f)
                curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0f, 2.83f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-5f)
                verticalLineTo(2f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
            }
        }.also { _ArrowRightToBracket = it}
