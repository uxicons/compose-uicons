package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseBlank: ImageVector? = null

val Icons.Tc.HouseBlank: ImageVector
    get() = _HouseBlank ?: UXIcon(name = "HouseBlank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.45f, 6.75f)
                curveToRelative(-0.04f, -0.06f, -0.08f, -0.11f, -0.14f, -0.15f)
                curveToRelative(-0.73f, -0.52f, -7.21f, -5.09f, -9.31f, -5.09f)
                reflectiveCurveToRelative(-8.58f, 4.57f, -9.31f, 5.09f)
                curveToRelative(-0.06f, 0.04f, -0.1f, 0.09f, -0.14f, 0.15f)
                curveToRelative(-0.06f, 0.11f, -1.55f, 2.68f, -1.55f, 7.75f)
                curveToRelative(0f, 3.05f, 1.03f, 6.04f, 1.08f, 6.17f)
                curveToRelative(0.05f, 0.14f, 0.15f, 0.24f, 0.28f, 0.3f)
                curveToRelative(0.15f, 0.06f, 3.83f, 1.54f, 9.64f, 1.54f)
                reflectiveCurveToRelative(9.48f, -1.47f, 9.64f, -1.54f)
                curveToRelative(0.13f, -0.05f, 0.24f, -0.16f, 0.28f, -0.3f)
                curveToRelative(0.04f, -0.12f, 1.08f, -3.12f, 1.08f, -6.17f)
                curveToRelative(0f, -5.08f, -1.49f, -7.65f, -1.55f, -7.75f)
                close()
                moveTo(21.05f, 20.12f)
                curveToRelative(-0.85f, 0.3f, -4.21f, 1.38f, -9.05f, 1.38f)
                reflectiveCurveToRelative(-8.2f, -1.08f, -9.05f, -1.38f)
                curveToRelative(-0.23f, -0.73f, -0.95f, -3.19f, -0.95f, -5.62f)
                curveToRelative(0f, -4.28f, 1.12f, -6.69f, 1.36f, -7.16f)
                curveToRelative(2.68f, -1.9f, 7.31f, -4.84f, 8.64f, -4.84f)
                reflectiveCurveToRelative(5.96f, 2.94f, 8.64f, 4.84f)
                curveToRelative(0.24f, 0.47f, 1.36f, 2.88f, 1.36f, 7.16f)
                curveToRelative(0f, 2.42f, -0.72f, 4.88f, -0.95f, 5.62f)
                close()
            }
        }.also { _HouseBlank = it}
