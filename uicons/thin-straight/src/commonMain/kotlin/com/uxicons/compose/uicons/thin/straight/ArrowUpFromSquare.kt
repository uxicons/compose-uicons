package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpFromSquare: ImageVector? = null

val Icons.Ts.ArrowUpFromSquare: ImageVector
    get() = _ArrowUpFromSquare ?: UXIcon(name = "ArrowUpFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 6.5f)
                verticalLineTo(24f)
                horizontalLineTo(2f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.38f)
                lineToRelative(-1.11f, 1.19f)
                curveToRelative(-0.46f, 0.26f, -0.77f, 0.75f, -0.77f, 1.31f)
                verticalLineTo(23f)
                horizontalLineTo(21f)
                verticalLineTo(6.5f)
                curveToRelative(0f, -0.56f, -0.31f, -1.05f, -0.77f, -1.31f)
                lineToRelative(-1.11f, -1.19f)
                horizontalLineToRelative(0.38f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(11.5f, 1.29f)
                verticalLineToRelative(14.71f)
                horizontalLineToRelative(1f)
                verticalLineTo(1.29f)
                lineToRelative(5.35f, 5.35f)
                lineToRelative(0.71f, -0.71f)
                lineTo(13.06f, 0.44f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, 0f)
                lineTo(5.44f, 5.94f)
                lineToRelative(0.71f, 0.71f)
                lineTo(11.5f, 1.29f)
                close()
            }
        }.also { _ArrowUpFromSquare = it}
