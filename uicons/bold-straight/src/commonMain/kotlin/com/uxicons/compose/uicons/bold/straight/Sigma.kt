package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sigma: ImageVector? = null

val Icons.Bs.Sigma: ImageVector
    get() = _Sigma ?: UXIcon(name = "Sigma") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 24f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2.6f)
                lineToRelative(8.93f, -9.4f)
                lineTo(2f, 2.6f)
                verticalLineTo(0f)
                horizontalLineToRelative(16.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(6.52f)
                lineToRelative(8.55f, 9f)
                lineToRelative(-8.55f, 9f)
                horizontalLineToRelative(11.98f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Sigma = it}
