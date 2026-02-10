package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sigma: ImageVector? = null

val Icons.Tr.Sigma: ImageVector
    get() = _Sigma ?: UXIcon(name = "Sigma") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 24f)
                horizontalLineTo(4.37f)
                curveToRelative(-0.95f, 0f, -1.78f, -0.54f, -2.17f, -1.41f)
                curveToRelative(-0.39f, -0.87f, -0.23f, -1.84f, 0.41f, -2.55f)
                lineToRelative(9.13f, -8.04f)
                lineTo(2.66f, 4.0f)
                curveToRelative(-0.68f, -0.74f, -0.83f, -1.72f, -0.45f, -2.59f)
                curveToRelative(0.39f, -0.87f, 1.22f, -1.41f, 2.17f, -1.41f)
                horizontalLineToRelative(14.13f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineTo(4.37f)
                curveToRelative(-0.56f, 0f, -1.02f, 0.3f, -1.25f, 0.81f)
                reflectiveCurveToRelative(-0.14f, 1.06f, 0.24f, 1.47f)
                lineToRelative(9.47f, 8.34f)
                curveToRelative(0.11f, 0.1f, 0.17f, 0.23f, 0.17f, 0.38f)
                reflectiveCurveToRelative(-0.06f, 0.28f, -0.17f, 0.38f)
                lineTo(3.32f, 20.75f)
                curveToRelative(-0.33f, 0.37f, -0.42f, 0.92f, -0.2f, 1.43f)
                reflectiveCurveToRelative(0.69f, 0.81f, 1.25f, 0.81f)
                horizontalLineToRelative(14.13f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Sigma = it}
