package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CrossReligion: ImageVector? = null

val Icons.Ss.CrossReligion: ImageVector
    get() = _CrossReligion ?: UXIcon(name = "CrossReligion") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 7f)
                horizontalLineToRelative(-4.5f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineTo(7f)
                horizontalLineTo(4.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(6f)
                verticalLineTo(13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
            }
        }.also { _CrossReligion = it}
