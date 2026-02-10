package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BuildingMaterials: ImageVector? = null

val Icons.Ss.BuildingMaterials: ImageVector
    get() = _BuildingMaterials ?: UXIcon(name = "BuildingMaterials") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 24f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(14f, 22f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(24f, 16f)
                curveToRelative(-0.8f, 0f, -2.32f, -0.62f, -3.72f, -1.73f)
                curveToRelative(-1.08f, -0.85f, -2.05f, -1.98f, -2.57f, -3.27f)
                horizontalLineToRelative(2.23f)
                curveToRelative(0.41f, 0.66f, 0.97f, 1.23f, 1.55f, 1.69f)
                lineToRelative(0.0f, -0.0f)
                curveToRelative(0.58f, 0.46f, 1.21f, 0.85f, 1.88f, 1.13f)
                lineToRelative(0.58f, -4.82f)
                horizontalLineToRelative(-14.92f)
                lineToRelative(0.84f, 7f)
                horizontalLineToRelative(2.12f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(6.15f)
                lineToRelative(0.74f, -6.16f)
                curveToRelative(0.41f, 0.1f, 0.78f, 0.16f, 1.1f, 0.16f)
                verticalLineToRelative(-2f)
                close()
                moveTo(6.78f, 7f)
                horizontalLineToRelative(12.97f)
                curveToRelative(-0.44f, -4.33f, -0.73f, -5.09f, -1.02f, -6.36f)
                curveToRelative(-1.19f, -0.15f, -3.66f, -0.59f, -8.23f, -0.64f)
                curveToRelative(-4.58f, 0.05f, -7.06f, 0.49f, -8.26f, 0.64f)
                curveToRelative(-0.29f, 1.33f, -1.17f, 4.21f, -1.25f, 11.63f)
                curveToRelative(0f, 1.34f, 0.04f, 2.58f, 0.12f, 3.73f)
                horizontalLineToRelative(6.76f)
                lineToRelative(-1.08f, -9f)
                close()
            }
        }.also { _BuildingMaterials = it}
