package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AustralSign: ImageVector? = null

val Icons.Tr.AustralSign: ImageVector
    get() = _AustralSign ?: UXIcon(name = "AustralSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.97f, 23.32f)
                lineToRelative(-2.88f, -7.32f)
                horizontalLineToRelative(2.41f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-2.81f)
                lineToRelative(-1.18f, -3f)
                horizontalLineToRelative(3.98f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-4.38f)
                lineTo(15.83f, 2.61f)
                curveTo(15.19f, 1f, 13.73f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-3.19f, 1f, -3.83f, 2.61f)
                lineToRelative(-3.3f, 8.39f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(3.98f)
                lineToRelative(-1.18f, 3f)
                horizontalLineTo(0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineTo(2.91f)
                lineTo(0.03f, 23.32f)
                curveToRelative(-0.1f, 0.26f, 0.03f, 0.55f, 0.28f, 0.65f)
                curveToRelative(0.26f, 0.1f, 0.55f, -0.03f, 0.65f, -0.28f)
                lineToRelative(3.02f, -7.69f)
                horizontalLineTo(20.01f)
                lineToRelative(3.02f, 7.69f)
                curveToRelative(0.08f, 0.2f, 0.27f, 0.32f, 0.47f, 0.32f)
                curveToRelative(0.06f, 0f, 0.12f, -0.01f, 0.18f, -0.03f)
                curveToRelative(0.26f, -0.1f, 0.38f, -0.39f, 0.28f, -0.65f)
                close()
                moveTo(9.11f, 2.98f)
                curveToRelative(0.57f, -1.45f, 1.87f, -1.97f, 2.89f, -1.97f)
                reflectiveCurveToRelative(2.32f, 0.52f, 2.89f, 1.97f)
                lineToRelative(3.15f, 8.02f)
                horizontalLineTo(5.95f)
                lineTo(9.11f, 2.98f)
                close()
                moveTo(4.38f, 15f)
                lineToRelative(1.18f, -3f)
                horizontalLineToRelative(12.88f)
                lineToRelative(1.18f, 3f)
                horizontalLineTo(4.38f)
                close()
            }
        }.also { _AustralSign = it}
