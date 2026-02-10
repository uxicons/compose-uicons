package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FunctionSquare: ImageVector? = null

val Icons.Bs.FunctionSquare: ImageVector
    get() = _FunctionSquare ?: UXIcon(name = "FunctionSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(10f, 4.75f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(-1.75f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(1.75f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.79f, 1.46f, -3.25f, 3.25f, -3.25f)
                close()
                moveTo(19.69f, 11f)
                lineToRelative(-2.45f, 4f)
                lineToRelative(2.45f, 4f)
                horizontalLineToRelative(-2.93f)
                lineToRelative(-0.98f, -1.6f)
                lineToRelative(-0.98f, 1.6f)
                horizontalLineToRelative(-2.93f)
                lineToRelative(2.45f, -4f)
                lineToRelative(-2.45f, -4f)
                horizontalLineToRelative(2.93f)
                lineToRelative(0.98f, 1.6f)
                lineToRelative(0.98f, -1.6f)
                horizontalLineToRelative(2.93f)
                close()
            }
        }.also { _FunctionSquare = it}
