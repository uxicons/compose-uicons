package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LitecoinSign: ImageVector? = null

val Icons.Tr.LitecoinSign: ImageVector
    get() = _LitecoinSign ?: UXIcon(name = "LitecoinSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(8.5f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-6.72f)
                lineToRelative(-3.33f, 1.19f)
                curveToRelative(-0.06f, 0.02f, -0.11f, 0.03f, -0.17f, 0.03f)
                curveToRelative(-0.21f, 0f, -0.4f, -0.13f, -0.47f, -0.33f)
                curveToRelative(-0.09f, -0.26f, 0.04f, -0.55f, 0.3f, -0.64f)
                lineToRelative(3.67f, -1.31f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(11.36f)
                lineToRelative(9.33f, -3.33f)
                curveToRelative(0.26f, -0.09f, 0.55f, 0.04f, 0.64f, 0.3f)
                curveToRelative(0.09f, 0.26f, -0.04f, 0.55f, -0.3f, 0.64f)
                lineToRelative(-9.67f, 3.45f)
                verticalLineToRelative(7.08f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _LitecoinSign = it}
