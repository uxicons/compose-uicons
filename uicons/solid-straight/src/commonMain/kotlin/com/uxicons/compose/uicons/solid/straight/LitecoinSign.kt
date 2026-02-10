package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LitecoinSign: ImageVector? = null

val Icons.Ss.LitecoinSign: ImageVector
    get() = _LitecoinSign ?: UXIcon(name = "LitecoinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-7.89f)
                lineTo(0f, 14.44f)
                verticalLineToRelative(-2.11f)
                lineToRelative(4f, -1.33f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(10.33f)
                lineToRelative(10f, -3.33f)
                verticalLineToRelative(2.11f)
                lineToRelative(-10f, 3.33f)
                verticalLineToRelative(8.56f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(15f)
                close()
            }
        }.also { _LitecoinSign = it}
