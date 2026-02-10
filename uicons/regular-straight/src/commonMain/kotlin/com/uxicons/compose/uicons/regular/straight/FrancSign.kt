package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FrancSign: ImageVector? = null

val Icons.Rs.FrancSign: ImageVector
    get() = _FrancSign ?: UXIcon(name = "FrancSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 3f)
                verticalLineTo(11f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineTo(0f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(15f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _FrancSign = it}
