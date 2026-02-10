package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownFromBracket: ImageVector? = null

val Icons.Ss.DownFromBracket: ImageVector
    get() = _DownFromBracket ?: UXIcon(name = "DownFromBracket") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 24f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.8f, 0f, -1.56f, -0.31f, -2.13f, -0.89f)
                lineToRelative(-0.01f, -0.01f)
                lineTo(0.07f, 13f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(10f)
                verticalLineTo(13f)
                horizontalLineToRelative(6.95f)
                lineToRelative(-9.81f, 10.11f)
                curveToRelative(-0.58f, 0.58f, -1.33f, 0.89f, -2.13f, 0.89f)
                close()
                moveTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(6f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineTo(21f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                close()
            }
        }.also { _DownFromBracket = it}
