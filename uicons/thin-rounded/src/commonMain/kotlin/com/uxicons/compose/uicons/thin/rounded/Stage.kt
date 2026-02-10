package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stage: ImageVector? = null

val Icons.Tr.Stage: ImageVector
    get() = _Stage ?: UXIcon(name = "Stage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.5f, 23f)
                horizontalLineToRelative(-5.3f)
                lineToRelative(-4.43f, -4.27f)
                curveToRelative(-0.35f, -0.35f, -0.8f, -0.57f, -1.27f, -0.66f)
                lineTo(12.5f, 6.21f)
                lineToRelative(1.62f, -1.62f)
                curveToRelative(0.4f, 0.26f, 0.87f, 0.42f, 1.38f, 0.42f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.51f, 0.15f, 0.98f, 0.42f, 1.38f)
                lineToRelative(-4.27f, 4.27f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                lineToRelative(1.65f, -1.65f)
                verticalLineToRelative(10.87f)
                curveToRelative(-0.47f, 0.09f, -0.92f, 0.31f, -1.26f, 0.65f)
                lineToRelative(-4.44f, 4.27f)
                lineTo(0.5f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(23f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(15.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13.07f, 19.45f)
                lineToRelative(3.69f, 3.55f)
                horizontalLineToRelative(-4.26f)
                verticalLineToRelative(-3.89f)
                curveToRelative(0.21f, 0.07f, 0.41f, 0.18f, 0.57f, 0.34f)
                close()
                moveTo(10.94f, 19.44f)
                curveToRelative(0.16f, -0.16f, 0.35f, -0.26f, 0.56f, -0.33f)
                verticalLineToRelative(3.89f)
                horizontalLineToRelative(-4.26f)
                lineToRelative(3.7f, -3.56f)
                close()
            }
        }.also { _Stage = it}
