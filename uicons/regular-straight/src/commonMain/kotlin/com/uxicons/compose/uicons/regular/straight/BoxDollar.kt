package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxDollar: ImageVector? = null

val Icons.Rs.BoxDollar: ImageVector
    get() = _BoxDollar ?: UXIcon(name = "BoxDollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineTo(3f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(6f)
                horizontalLineTo(1f)
                verticalLineToRelative(15f)
                horizontalLineTo(23f)
                verticalLineTo(9f)
                horizontalLineToRelative(1f)
                verticalLineTo(3f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineTo(21f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                close()
                moveTo(21f, 22f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                horizontalLineTo(21f)
                verticalLineToRelative(13f)
                close()
                moveTo(8f, 13.62f)
                curveToRelative(0f, -1.45f, 1.18f, -2.62f, 2.62f, -2.62f)
                horizontalLineToRelative(0.38f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2.38f)
                curveToRelative(-0.34f, 0f, -0.62f, 0.28f, -0.62f, 0.62f)
                curveToRelative(0f, 0.31f, 0.22f, 0.57f, 0.52f, 0.62f)
                lineToRelative(3.29f, 0.55f)
                curveToRelative(1.27f, 0.21f, 2.19f, 1.3f, 2.19f, 2.59f)
                curveToRelative(0f, 1.45f, -1.18f, 2.62f, -2.62f, 2.62f)
                horizontalLineToRelative(-0.38f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.34f, 0f, 0.62f, -0.28f, 0.62f, -0.62f)
                curveToRelative(0f, -0.31f, -0.22f, -0.57f, -0.52f, -0.62f)
                lineToRelative(-3.29f, -0.55f)
                curveToRelative(-1.27f, -0.21f, -2.19f, -1.3f, -2.19f, -2.59f)
                close()
            }
        }.also { _BoxDollar = it}
