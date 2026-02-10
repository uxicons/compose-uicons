package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KipSign: ImageVector? = null

val Icons.Rr.KipSign: ImageVector
    get() = _KipSign ?: UXIcon(name = "KipSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(8.94f)
                lineToRelative(10.67f, 8.21f)
                curveToRelative(0.44f, 0.34f, 0.52f, 0.96f, 0.18f, 1.4f)
                curveToRelative(-0.2f, 0.26f, -0.49f, 0.39f, -0.79f, 0.39f)
                curveToRelative(-0.21f, 0f, -0.43f, -0.07f, -0.61f, -0.21f)
                lineTo(7f, 15.03f)
                verticalLineToRelative(7.97f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(14f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineTo(10.72f)
                lineTo(18.32f, 0.27f)
                curveToRelative(0.41f, -0.38f, 1.04f, -0.35f, 1.41f, 0.06f)
                curveToRelative(0.38f, 0.41f, 0.35f, 1.04f, -0.06f, 1.41f)
                lineTo(8.56f, 12f)
                horizontalLineToRelative(12.44f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _KipSign = it}
