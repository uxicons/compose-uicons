package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Glass: ImageVector? = null

val Icons.Tc.Glass: ImageVector
    get() = _Glass ?: UXIcon(name = "Glass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.56f, 1.89f)
                curveToRelative(-0.04f, -0.01f, -4.49f, -0.89f, -9.56f, -0.89f)
                reflectiveCurveTo(2.48f, 1.88f, 2.44f, 1.89f)
                curveToRelative(-0.25f, 0.05f, -0.43f, 0.29f, -0.4f, 0.55f)
                lineToRelative(2.14f, 19.25f)
                curveToRelative(0.02f, 0.18f, 0.14f, 0.34f, 0.31f, 0.41f)
                curveToRelative(0.09f, 0.04f, 2.38f, 0.91f, 7.51f, 0.91f)
                reflectiveCurveToRelative(7.41f, -0.87f, 7.51f, -0.91f)
                curveToRelative(0.17f, -0.07f, 0.29f, -0.23f, 0.31f, -0.41f)
                lineTo(21.96f, 2.43f)
                curveToRelative(0.03f, -0.26f, -0.14f, -0.49f, -0.4f, -0.55f)
                close()
                moveTo(18.86f, 21.25f)
                curveToRelative(-0.73f, 0.22f, -2.94f, 0.75f, -6.86f, 0.75f)
                reflectiveCurveToRelative(-6.13f, -0.53f, -6.86f, -0.75f)
                lineToRelative(-1.37f, -12.35f)
                lineTo(15.47f, 8.9f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.65f, 7.9f)
                lineToRelative(-0.57f, -5.12f)
                curveToRelative(1.24f, -0.22f, 4.87f, -0.78f, 8.91f, -0.78f)
                reflectiveCurveToRelative(7.68f, 0.57f, 8.91f, 0.78f)
                lineToRelative(-2.05f, 18.47f)
                close()
            }
        }.also { _Glass = it}
