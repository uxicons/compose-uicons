package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingMaterials: ImageVector? = null

val Icons.Bs.BuildingMaterials: ImageVector
    get() = _BuildingMaterials ?: UXIcon(name = "BuildingMaterials") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 21f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(8f, 24f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(4f, 19f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(24f, 16f)
                curveToRelative(-2.1f, -0.44f, -4.03f, -2.21f, -5.23f, -4f)
                horizontalLineToRelative(2.52f)
                curveToRelative(0.69f, 0.74f, 1.49f, 1.32f, 2.1f, 1.67f)
                lineToRelative(0.56f, -4.67f)
                horizontalLineToRelative(-15.42f)
                lineToRelative(0.6f, 5f)
                horizontalLineToRelative(3.02f)
                lineToRelative(-0.24f, -2f)
                horizontalLineToRelative(3.51f)
                curveToRelative(0.9f, 2.2f, 2.67f, 4.11f, 4.5f, 5.38f)
                lineToRelative(-0.44f, 3.62f)
                horizontalLineToRelative(-3.49f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.15f)
                lineToRelative(0.63f, -5.2f)
                curveToRelative(0.44f, 0.12f, 0.85f, 0.2f, 1.22f, 0.2f)
                close()
                moveTo(4.04f, 14f)
                curveToRelative(-0.02f, -0.61f, -0.04f, -1.24f, -0.04f, -1.9f)
                curveToRelative(0f, -4.1f, 0.47f, -7.24f, 0.75f, -8.75f)
                curveToRelative(1.27f, -0.14f, 3.53f, -0.36f, 5.76f, -0.36f)
                reflectiveCurveToRelative(4.47f, 0.21f, 5.74f, 0.35f)
                curveToRelative(0.15f, 0.79f, 0.35f, 2.05f, 0.5f, 3.65f)
                horizontalLineToRelative(3.02f)
                curveToRelative(-0.47f, -4.43f, -0.66f, -4.62f, -1.06f, -6.34f)
                curveToRelative(-1.67f, -0.21f, -3.45f, -0.59f, -8.2f, -0.66f)
                curveToRelative(-4.75f, 0.07f, -6.55f, 0.45f, -8.22f, 0.66f)
                curveToRelative(-0.42f, 1.9f, -1.16f, 3.92f, -1.29f, 11.45f)
                curveToRelative(0f, 0.66f, 0.01f, 1.29f, 0.03f, 1.9f)
                close()
            }
        }.also { _BuildingMaterials = it}
