package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserChef: ImageVector? = null

val Icons.Ss.UserChef: ImageVector
    get() = _UserChef ?: UXIcon(name = "UserChef") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 9f)
                horizontalLineToRelative(11.99f)
                curveToRelative(-0.1f, 3.09f, -2.44f, 5.69f, -5.4f, 5.97f)
                curveToRelative(-0.19f, 0.02f, -0.38f, 0.03f, -0.57f, 0.03f)
                curveToRelative(-1.49f, 0f, -2.94f, -0.55f, -4.05f, -1.56f)
                curveToRelative(-1.25f, -1.14f, -1.96f, -2.75f, -1.96f, -4.44f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                close()
                moveTo(21f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(5f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(16f, 20.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(6.0f, 4.95f)
                curveToRelative(0f, 0.97f, 0f, 2.05f, 0f, 2.05f)
                horizontalLineToRelative(12f)
                reflectiveCurveToRelative(0f, -1.08f, 0f, -2.05f)
                curveToRelative(1.14f, -0.23f, 2.0f, -1.24f, 2.0f, -2.45f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.6f, 0f, -1.62f, 0.21f, -2.58f, 0.56f)
                curveToRelative(-0.0f, -0.0f, -0.01f, -0.01f, -0.01f, -0.01f)
                curveToRelative(-0.62f, -0.22f, -1.75f, -0.55f, -2.9f, -0.55f)
                reflectiveCurveToRelative(-2.29f, 0.33f, -2.9f, 0.55f)
                curveToRelative(-0.0f, 0.0f, -0.01f, 0.01f, -0.01f, 0.01f)
                curveToRelative(-0.96f, -0.35f, -1.99f, -0.56f, -2.58f, -0.56f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2.0f, 2.45f)
                close()
            }
        }.also { _UserChef = it}
