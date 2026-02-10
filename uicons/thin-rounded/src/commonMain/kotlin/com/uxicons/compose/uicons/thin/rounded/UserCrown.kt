package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCrown: ImageVector? = null

val Icons.Tr.UserCrown: ImageVector
    get() = _UserCrown ?: UXIcon(name = "UserCrown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(1f)
                curveToRelative(4.14f, 0f, 7.5f, 3.36f, 7.5f, 7.5f)
                close()
                moveTo(6f, 8f)
                lineTo(6f, 1.0f)
                curveToRelative(0f, -0.4f, 0.22f, -0.74f, 0.58f, -0.91f)
                curveToRelative(0.36f, -0.16f, 0.77f, -0.11f, 1.07f, 0.15f)
                lineToRelative(1.63f, 2.0f)
                lineToRelative(1.67f, -1.8f)
                curveToRelative(0.59f, -0.58f, 1.52f, -0.58f, 2.09f, -0.01f)
                lineToRelative(1.68f, 1.81f)
                lineToRelative(1.5f, -1.88f)
                curveToRelative(0.28f, -0.34f, 0.71f, -0.46f, 1.11f, -0.31f)
                curveToRelative(0.4f, 0.14f, 0.66f, 0.51f, 0.66f, 0.94f)
                verticalLineToRelative(7.02f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                close()
                moveTo(6.94f, 0.94f)
                lineToRelative(0.06f, 5.06f)
                horizontalLineToRelative(10f)
                lineTo(17f, 0.98f)
                lineToRelative(-1.86f, 2.33f)
                curveToRelative(-0.09f, 0.11f, -0.23f, 0.18f, -0.37f, 0.19f)
                curveToRelative(-0.15f, -0.01f, -0.29f, -0.05f, -0.39f, -0.16f)
                lineToRelative(-2.06f, -2.22f)
                curveToRelative(-0.17f, -0.17f, -0.47f, -0.17f, -0.65f, 0.01f)
                lineToRelative(-2.05f, 2.2f)
                curveToRelative(-0.1f, 0.1f, -0.26f, 0.16f, -0.38f, 0.16f)
                curveToRelative(-0.14f, -0.01f, -0.28f, -0.07f, -0.37f, -0.19f)
                lineToRelative(-1.93f, -2.38f)
                close()
                moveTo(7f, 8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                lineTo(7f, 7f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _UserCrown = it}
