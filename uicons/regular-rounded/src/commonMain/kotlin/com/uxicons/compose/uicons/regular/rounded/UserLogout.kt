package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserLogout: ImageVector? = null

val Icons.Rr.UserLogout: ImageVector
    get() = _UserLogout ?: UXIcon(name = "UserLogout") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(8f, 10f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(10.99f, 15.19f)
                curveToRelative(-0.07f, 0.55f, -0.56f, 0.94f, -1.12f, 0.87f)
                curveToRelative(-0.29f, -0.04f, -0.58f, -0.05f, -0.88f, -0.05f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -4.96f, 4.04f, -9f, 9f, -9f)
                curveToRelative(0.38f, 0f, 0.76f, 0.02f, 1.12f, 0.07f)
                curveToRelative(0.55f, 0.07f, 0.94f, 0.57f, 0.87f, 1.12f)
                close()
                moveTo(18f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(24.0f, 18.02f)
                curveToRelative(0f, 0.54f, -0.21f, 1.01f, -0.6f, 1.35f)
                lineToRelative(-2.2f, 1.94f)
                curveToRelative(-0.19f, 0.17f, -0.43f, 0.25f, -0.66f, 0.25f)
                curveToRelative(-0.28f, 0f, -0.55f, -0.11f, -0.75f, -0.34f)
                curveToRelative(-0.36f, -0.41f, -0.33f, -1.05f, 0.09f, -1.41f)
                lineToRelative(0.92f, -0.81f)
                horizontalLineToRelative(-2.79f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.66f)
                lineToRelative(-0.78f, -0.69f)
                curveToRelative(-0.41f, -0.36f, -0.45f, -1.0f, -0.09f, -1.41f)
                curveToRelative(0.36f, -0.41f, 1f, -0.45f, 1.41f, -0.09f)
                lineToRelative(2.21f, 1.95f)
                curveToRelative(0.37f, 0.31f, 0.59f, 0.79f, 0.59f, 1.27f)
                close()
            }
        }.also { _UserLogout = it}
