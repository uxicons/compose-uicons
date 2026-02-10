package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BriefcaseBlank: ImageVector? = null

val Icons.Ss.BriefcaseBlank: ImageVector
    get() = _BriefcaseBlank ?: UXIcon(name = "BriefcaseBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(8f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(8f, 2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                close()
            }
        }.also { _BriefcaseBlank = it}
