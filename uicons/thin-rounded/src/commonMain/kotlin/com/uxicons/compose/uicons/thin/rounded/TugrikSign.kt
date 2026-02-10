package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TugrikSign: ImageVector? = null

val Icons.Tr.TugrikSign: ImageVector
    get() = _TugrikSign ?: UXIcon(name = "TugrikSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.31f)
                lineToRelative(6.84f, -2.28f)
                curveToRelative(0.26f, -0.09f, 0.54f, 0.05f, 0.63f, 0.32f)
                curveToRelative(0.09f, 0.26f, -0.05f, 0.54f, -0.32f, 0.63f)
                lineToRelative(-7.16f, 2.39f)
                verticalLineToRelative(2.95f)
                lineToRelative(6.84f, -2.28f)
                curveToRelative(0.26f, -0.09f, 0.54f, 0.05f, 0.63f, 0.32f)
                curveToRelative(0.09f, 0.26f, -0.05f, 0.54f, -0.32f, 0.63f)
                lineToRelative(-7.16f, 2.39f)
                verticalLineToRelative(9.14f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(14.69f)
                lineToRelative(-6.84f, 2.28f)
                curveToRelative(-0.05f, 0.02f, -0.11f, 0.03f, -0.16f, 0.03f)
                curveToRelative(-0.21f, 0f, -0.4f, -0.13f, -0.47f, -0.34f)
                curveToRelative(-0.09f, -0.26f, 0.05f, -0.54f, 0.32f, -0.63f)
                lineToRelative(7.16f, -2.39f)
                verticalLineToRelative(-2.95f)
                lineToRelative(-6.84f, 2.28f)
                curveToRelative(-0.05f, 0.02f, -0.11f, 0.03f, -0.16f, 0.03f)
                curveToRelative(-0.21f, 0f, -0.4f, -0.13f, -0.47f, -0.34f)
                curveToRelative(-0.09f, -0.26f, 0.05f, -0.54f, 0.32f, -0.63f)
                lineToRelative(7.16f, -2.39f)
                verticalLineTo(1f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(21f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _TugrikSign = it}
