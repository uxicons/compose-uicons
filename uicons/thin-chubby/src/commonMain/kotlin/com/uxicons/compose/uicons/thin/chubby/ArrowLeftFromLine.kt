package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromLine: ImageVector? = null

val Icons.Tc.ArrowLeftFromLine: ImageVector
    get() = _ArrowLeftFromLine ?: UXIcon(name = "ArrowLeftFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 1.5f)
                verticalLineToRelative(21.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-21.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(18.5f, 11.5f)
                horizontalLineToRelative(-16.03f)
                curveToRelative(1.41f, -1.97f, 3.18f, -3.69f, 5.31f, -5.08f)
                curveToRelative(0.23f, -0.15f, 0.3f, -0.46f, 0.14f, -0.69f)
                reflectiveCurveToRelative(-0.46f, -0.3f, -0.69f, -0.14f)
                curveToRelative(-2.52f, 1.65f, -4.59f, 3.72f, -6.15f, 6.15f)
                curveToRelative(-0.1f, 0.16f, -0.1f, 0.38f, 0f, 0.54f)
                curveToRelative(1.55f, 2.43f, 3.62f, 4.5f, 6.15f, 6.15f)
                curveToRelative(0.23f, 0.15f, 0.54f, 0.09f, 0.69f, -0.14f)
                curveToRelative(0.15f, -0.23f, 0.09f, -0.54f, -0.14f, -0.69f)
                curveToRelative(-2.13f, -1.39f, -3.9f, -3.11f, -5.31f, -5.08f)
                horizontalLineToRelative(16.03f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _ArrowLeftFromLine = it}
