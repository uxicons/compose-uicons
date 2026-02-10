package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromLine: ImageVector? = null

val Icons.Ts.ArrowLeftFromLine: ImageVector
    get() = _ArrowLeftFromLine ?: UXIcon(name = "ArrowLeftFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1.29f, 11.5f)
                horizontalLineTo(20f)
                verticalLineToRelative(1f)
                horizontalLineTo(1.29f)
                lineToRelative(5.35f, 5.35f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(0.44f, 13.06f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.54f, 0f, -2.12f)
                lineTo(5.94f, 5.44f)
                lineToRelative(0.71f, 0.71f)
                lineTo(1.29f, 11.5f)
                close()
                moveTo(23f, 0f)
                verticalLineTo(24f)
                horizontalLineToRelative(1f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _ArrowLeftFromLine = it}
