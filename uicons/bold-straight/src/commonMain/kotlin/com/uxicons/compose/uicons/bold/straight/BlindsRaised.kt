package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlindsRaised: ImageVector? = null

val Icons.Bs.BlindsRaised: ImageVector
    get() = _BlindsRaised ?: UXIcon(name = "BlindsRaised") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17.34f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineTo(24f)
                horizontalLineTo(16.26f)
                curveToRelative(-0.69f, -0.83f, -1.13f, -1.87f, -1.23f, -3f)
                horizontalLineTo(3f)
                verticalLineTo(13f)
                horizontalLineToRelative(14f)
                verticalLineTo(3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(13.84f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.39f, -0.82f, -2.6f, -2f, -3.16f)
                close()
                moveTo(3f, 10f)
                verticalLineToRelative(-2f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                close()
                moveTo(14f, 5f)
                horizontalLineTo(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(14f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BlindsRaised = it}
