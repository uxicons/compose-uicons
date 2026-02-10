package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FunctionSquare: ImageVector? = null

val Icons.Rs.FunctionSquare: ImageVector
    get() = _FunctionSquare ?: UXIcon(name = "FunctionSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(17.02f, 11f)
                lineToRelative(-1.27f, 2.08f)
                lineToRelative(-1.27f, -2.08f)
                horizontalLineToRelative(-2.33f)
                lineToRelative(2.43f, 4.0f)
                lineToRelative(-2.43f, 4.0f)
                horizontalLineToRelative(2.33f)
                lineToRelative(1.28f, -2.09f)
                lineToRelative(1.28f, 2.09f)
                horizontalLineToRelative(2.33f)
                lineToRelative(-2.43f, -4.0f)
                lineToRelative(2.43f, -4.0f)
                horizontalLineToRelative(-2.33f)
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
        }.also { _FunctionSquare = it}
