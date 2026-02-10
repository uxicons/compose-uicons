package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MoveToFolder2: ImageVector? = null

val Icons.Ts.MoveToFolder2: ImageVector
    get() = _MoveToFolder2 ?: UXIcon(name = "MoveToFolder2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.43f, 19.89f)
                lineToRelative(-3.2f, 3.2f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.2f, -3.2f)
                curveToRelative(0.06f, -0.06f, 0.11f, -0.12f, 0.15f, -0.19f)
                horizontalLineTo(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(10.87f)
                curveToRelative(-0.04f, -0.07f, -0.09f, -0.13f, -0.15f, -0.19f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.2f, 3.2f)
                curveToRelative(0.77f, 0.77f, 0.77f, 2.02f, 0f, 2.79f)
                close()
                moveTo(1f, 22f)
                horizontalLineTo(17f)
                verticalLineToRelative(1f)
                horizontalLineTo(0f)
                verticalLineTo(3.5f)
                curveTo(0f, 2.12f, 1.12f, 1f, 2.5f, 1f)
                horizontalLineToRelative(5.62f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.38f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineTo(15.3f)
                lineToRelative(-1f, -1f)
                verticalLineToRelative(-6.3f)
                horizontalLineTo(1f)
                verticalLineToRelative(14f)
                close()
                moveTo(1f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(23f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(11.88f)
                lineTo(7.88f, 2f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _MoveToFolder2 = it}
