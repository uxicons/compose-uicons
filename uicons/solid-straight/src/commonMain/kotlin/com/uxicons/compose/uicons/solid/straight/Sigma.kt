package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sigma: ImageVector? = null

val Icons.Ss.Sigma: ImageVector
    get() = _Sigma ?: UXIcon(name = "Sigma") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 24f)
                horizontalLineTo(2f)
                verticalLineToRelative(-1.9f)
                lineToRelative(9.62f, -10.1f)
                lineTo(2f, 1.9f)
                verticalLineTo(0f)
                horizontalLineToRelative(17f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(4.86f)
                lineToRelative(9.52f, 10f)
                lineToRelative(-9.52f, 10f)
                horizontalLineToRelative(14.14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _Sigma = it}
