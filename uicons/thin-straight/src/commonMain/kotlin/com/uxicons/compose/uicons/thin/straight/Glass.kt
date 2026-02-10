package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glass: ImageVector? = null

val Icons.Ts.Glass: ImageVector
    get() = _Glass ?: UXIcon(name = "Glass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.43f, 0f)
                lineToRelative(2.85f, 21.82f)
                curveToRelative(0.16f, 1.24f, 1.23f, 2.18f, 2.48f, 2.18f)
                horizontalLineToRelative(10.49f)
                curveToRelative(1.25f, 0f, 2.32f, -0.94f, 2.48f, -2.18f)
                lineTo(22.57f, 0f)
                horizontalLineTo(1.43f)
                close()
                moveTo(18.73f, 21.69f)
                curveToRelative(-0.1f, 0.74f, -0.74f, 1.31f, -1.49f, 1.31f)
                horizontalLineTo(6.76f)
                curveToRelative(-0.75f, 0f, -1.39f, -0.56f, -1.49f, -1.31f)
                lineToRelative(-1.79f, -13.69f)
                horizontalLineToRelative(15.02f)
                lineToRelative(0.13f, -1f)
                horizontalLineTo(3.35f)
                lineTo(2.57f, 1f)
                horizontalLineTo(21.43f)
                lineToRelative(-2.7f, 20.69f)
                close()
            }
        }.also { _Glass = it}
