package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KipSign: ImageVector? = null

val Icons.Tr.KipSign: ImageVector
    get() = _KipSign ?: UXIcon(name = "KipSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(7.46f)
                lineToRelative(12.35f, 9.61f)
                curveToRelative(0.22f, 0.17f, 0.26f, 0.48f, 0.09f, 0.7f)
                curveToRelative(-0.1f, 0.13f, -0.25f, 0.19f, -0.39f, 0.19f)
                curveToRelative(-0.11f, 0f, -0.22f, -0.03f, -0.31f, -0.11f)
                lineTo(6f, 13.63f)
                verticalLineToRelative(9.87f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(2.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(12.32f)
                lineTo(19.16f, 0.13f)
                curveToRelative(0.2f, -0.19f, 0.52f, -0.18f, 0.71f, 0.03f)
                reflectiveCurveToRelative(0.17f, 0.52f, -0.03f, 0.71f)
                lineTo(7.28f, 12.5f)
                horizontalLineToRelative(14.22f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _KipSign = it}
