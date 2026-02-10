package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodTestTube: ImageVector? = null

val Icons.Rr.BloodTestTube: ImageVector
    get() = _BloodTestTube ?: UXIcon(name = "BloodTestTube") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.25f, 20.98f)
                curveToRelative(-0.57f, 0.65f, -1.39f, 1.02f, -2.25f, 1.02f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(14f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(3f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                curveToRelative(1.43f, 0f, 2.8f, -0.62f, 3.75f, -1.69f)
                curveToRelative(0.36f, -0.41f, 0.33f, -1.05f, -0.09f, -1.41f)
                curveToRelative(-0.41f, -0.36f, -1.04f, -0.33f, -1.41f, 0.09f)
                close()
                moveTo(12f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-6f)
                lineTo(6f, 2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(20.55f, 11.48f)
                lineToRelative(-1.6f, -1.69f)
                curveToRelative(-1.08f, -1.06f, -2.83f, -1.06f, -3.94f, 0.03f)
                lineToRelative(-1.55f, 1.64f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0f, 7.07f)
                curveToRelative(0.94f, 0.94f, 2.2f, 1.46f, 3.54f, 1.46f)
                reflectiveCurveToRelative(2.59f, -0.52f, 3.54f, -1.46f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0.02f, -7.05f)
                close()
                moveTo(19.12f, 17.12f)
                curveToRelative(-1.13f, 1.13f, -3.11f, 1.13f, -4.24f, 0f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0.02f, -4.26f)
                lineToRelative(1.54f, -1.63f)
                curveToRelative(0.16f, -0.15f, 0.37f, -0.23f, 0.57f, -0.23f)
                curveToRelative(0.19f, 0f, 0.38f, 0.07f, 0.52f, 0.2f)
                lineToRelative(1.59f, 1.68f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                close()
            }
        }.also { _BloodTestTube = it}
