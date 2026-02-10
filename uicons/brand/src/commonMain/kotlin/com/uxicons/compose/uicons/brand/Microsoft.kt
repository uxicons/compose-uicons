package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microsoft: ImageVector? = null

val Icons.Brand.Microsoft: ImageVector
    get() = _Microsoft ?: UXIcon(name = "Microsoft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0.05f, 0f)
            horizontalLineToRelative(11.39f)
            verticalLineToRelative(11.43f)
            horizontalLineToRelative(-11.39f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.64f, 0f)
            horizontalLineToRelative(11.31f)
            verticalLineToRelative(11.43f)
            horizontalLineToRelative(-11.31f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(0.05f, 12.57f)
            horizontalLineToRelative(11.39f)
            verticalLineToRelative(11.43f)
            horizontalLineToRelative(-11.39f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.64f, 12.57f)
            horizontalLineToRelative(11.31f)
            verticalLineToRelative(11.43f)
            horizontalLineToRelative(-11.31f)
            close()
        }
    }.also { _Microsoft = it }
