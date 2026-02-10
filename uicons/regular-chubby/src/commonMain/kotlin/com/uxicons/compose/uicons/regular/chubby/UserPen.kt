package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserPen: ImageVector? = null

val Icons.Rc.UserPen: ImageVector
    get() = _UserPen ?: UXIcon(name = "UserPen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 12f)
                curveToRelative(3.75f, 0f, 5.5f, -1.75f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-1.75f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 1.75f, -5.5f, 5.5f)
                reflectiveCurveToRelative(1.75f, 5.5f, 5.5f, 5.5f)
                close()
                moveTo(9.5f, 3f)
                curveToRelative(2.65f, 0f, 3.5f, 0.85f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-0.85f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -0.85f, -3.5f, -3.5f)
                reflectiveCurveToRelative(0.85f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(10.91f, 16.06f)
                curveToRelative(-0.43f, -0.04f, -0.91f, -0.06f, -1.41f, -0.06f)
                curveToRelative(-4.68f, 0f, -6.38f, 1.58f, -6.49f, 6.03f)
                curveToRelative(-0.01f, 0.54f, -0.46f, 0.97f, -1.0f, 0.97f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                curveToRelative(-0.55f, -0.01f, -0.99f, -0.47f, -0.97f, -1.03f)
                curveToRelative(0.15f, -5.51f, 2.77f, -7.97f, 8.49f, -7.97f)
                curveToRelative(0.56f, 0f, 1.1f, 0.02f, 1.59f, 0.07f)
                curveToRelative(0.55f, 0.05f, 0.95f, 0.54f, 0.9f, 1.09f)
                curveToRelative(-0.05f, 0.55f, -0.54f, 0.96f, -1.09f, 0.9f)
                close()
                moveTo(22.16f, 11.89f)
                reflectiveCurveToRelative(-0.01f, -0.01f, -0.01f, -0.01f)
                curveToRelative(-1.17f, -1.16f, -3.07f, -1.17f, -4.24f, -0.01f)
                lineToRelative(-5.41f, 5.41f)
                curveToRelative(-0.87f, 0.86f, -1.38f, 2.02f, -1.43f, 3.25f)
                lineToRelative(-0.06f, 1.43f)
                curveToRelative(-0.04f, 0.57f, 0.47f, 1.08f, 1.04f, 1.04f)
                lineToRelative(1.44f, -0.06f)
                curveToRelative(1.24f, -0.05f, 2.4f, -0.56f, 3.27f, -1.42f)
                lineToRelative(5.39f, -5.4f)
                curveToRelative(1.12f, -1.0f, 1.13f, -3.21f, 0.02f, -4.23f)
                close()
                moveTo(20.75f, 14.68f)
                lineTo(15.34f, 20.1f)
                curveToRelative(-0.52f, 0.51f, -1.2f, 0.81f, -1.94f, 0.84f)
                lineToRelative(-0.35f, 0.01f)
                lineToRelative(0.01f, -0.34f)
                curveToRelative(0.03f, -0.73f, 0.33f, -1.41f, 0.85f, -1.92f)
                lineToRelative(5.41f, -5.41f)
                curveToRelative(0.38f, -0.38f, 1.01f, -0.37f, 1.4f, -0.01f)
                curveToRelative(0.35f, 0.28f, 0.37f, 1.1f, 0.03f, 1.41f)
                close()
            }
        }.also { _UserPen = it}
